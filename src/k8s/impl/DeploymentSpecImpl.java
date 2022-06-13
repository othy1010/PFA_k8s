/**
 */
package k8s.impl;

import k8s.DeploymentSpec;
import k8s.DeploymentStrategy;
import k8s.K8sPackage;
import k8s.PodTemplate;
import k8s.Selector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link k8s.impl.DeploymentSpecImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link k8s.impl.DeploymentSpecImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link k8s.impl.DeploymentSpecImpl#getTemplate <em>Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentSpecImpl extends MinimalEObjectImpl.Container implements DeploymentSpec {
	/**
	 * The cached value of the '{@link #getSelector() <em>Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected Selector selector;

	/**
	 * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected DeploymentStrategy strategy;

	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected PodTemplate template;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return K8sPackage.Literals.DEPLOYMENT_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selector getSelector() {
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelector(Selector newSelector, NotificationChain msgs) {
		Selector oldSelector = selector;
		selector = newSelector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, K8sPackage.DEPLOYMENT_SPEC__SELECTOR, oldSelector, newSelector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelector(Selector newSelector) {
		if (newSelector != selector) {
			NotificationChain msgs = null;
			if (selector != null)
				msgs = ((InternalEObject)selector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - K8sPackage.DEPLOYMENT_SPEC__SELECTOR, null, msgs);
			if (newSelector != null)
				msgs = ((InternalEObject)newSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - K8sPackage.DEPLOYMENT_SPEC__SELECTOR, null, msgs);
			msgs = basicSetSelector(newSelector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.DEPLOYMENT_SPEC__SELECTOR, newSelector, newSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentStrategy getStrategy() {
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrategy(DeploymentStrategy newStrategy, NotificationChain msgs) {
		DeploymentStrategy oldStrategy = strategy;
		strategy = newStrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, K8sPackage.DEPLOYMENT_SPEC__STRATEGY, oldStrategy, newStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategy(DeploymentStrategy newStrategy) {
		if (newStrategy != strategy) {
			NotificationChain msgs = null;
			if (strategy != null)
				msgs = ((InternalEObject)strategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - K8sPackage.DEPLOYMENT_SPEC__STRATEGY, null, msgs);
			if (newStrategy != null)
				msgs = ((InternalEObject)newStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - K8sPackage.DEPLOYMENT_SPEC__STRATEGY, null, msgs);
			msgs = basicSetStrategy(newStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.DEPLOYMENT_SPEC__STRATEGY, newStrategy, newStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PodTemplate getTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplate(PodTemplate newTemplate, NotificationChain msgs) {
		PodTemplate oldTemplate = template;
		template = newTemplate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, K8sPackage.DEPLOYMENT_SPEC__TEMPLATE, oldTemplate, newTemplate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(PodTemplate newTemplate) {
		if (newTemplate != template) {
			NotificationChain msgs = null;
			if (template != null)
				msgs = ((InternalEObject)template).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - K8sPackage.DEPLOYMENT_SPEC__TEMPLATE, null, msgs);
			if (newTemplate != null)
				msgs = ((InternalEObject)newTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - K8sPackage.DEPLOYMENT_SPEC__TEMPLATE, null, msgs);
			msgs = basicSetTemplate(newTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.DEPLOYMENT_SPEC__TEMPLATE, newTemplate, newTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case K8sPackage.DEPLOYMENT_SPEC__SELECTOR:
				return basicSetSelector(null, msgs);
			case K8sPackage.DEPLOYMENT_SPEC__STRATEGY:
				return basicSetStrategy(null, msgs);
			case K8sPackage.DEPLOYMENT_SPEC__TEMPLATE:
				return basicSetTemplate(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case K8sPackage.DEPLOYMENT_SPEC__SELECTOR:
				return getSelector();
			case K8sPackage.DEPLOYMENT_SPEC__STRATEGY:
				return getStrategy();
			case K8sPackage.DEPLOYMENT_SPEC__TEMPLATE:
				return getTemplate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case K8sPackage.DEPLOYMENT_SPEC__SELECTOR:
				setSelector((Selector)newValue);
				return;
			case K8sPackage.DEPLOYMENT_SPEC__STRATEGY:
				setStrategy((DeploymentStrategy)newValue);
				return;
			case K8sPackage.DEPLOYMENT_SPEC__TEMPLATE:
				setTemplate((PodTemplate)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case K8sPackage.DEPLOYMENT_SPEC__SELECTOR:
				setSelector((Selector)null);
				return;
			case K8sPackage.DEPLOYMENT_SPEC__STRATEGY:
				setStrategy((DeploymentStrategy)null);
				return;
			case K8sPackage.DEPLOYMENT_SPEC__TEMPLATE:
				setTemplate((PodTemplate)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case K8sPackage.DEPLOYMENT_SPEC__SELECTOR:
				return selector != null;
			case K8sPackage.DEPLOYMENT_SPEC__STRATEGY:
				return strategy != null;
			case K8sPackage.DEPLOYMENT_SPEC__TEMPLATE:
				return template != null;
		}
		return super.eIsSet(featureID);
	}

} //DeploymentSpecImpl
