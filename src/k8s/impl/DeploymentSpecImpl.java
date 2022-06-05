/**
 */
package k8s.impl;

import k8s.DeploymentSpec;
import k8s.DeploymentStrategy;
import k8s.K8sPackage;
import k8s.PodTemplate;
import k8s.Selector;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
public class DeploymentSpecImpl extends SpecFactoryImpl implements DeploymentSpec {
	/**
	 * The cached value of the '{@link #getSelector() <em>Selector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected Selector selector;

	/**
	 * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected DeploymentStrategy strategy;

	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' reference.
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
		if (selector != null && selector.eIsProxy()) {
			InternalEObject oldSelector = (InternalEObject)selector;
			selector = (Selector)eResolveProxy(oldSelector);
			if (selector != oldSelector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, K8sPackage.DEPLOYMENT_SPEC__SELECTOR, oldSelector, selector));
			}
		}
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selector basicGetSelector() {
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelector(Selector newSelector) {
		Selector oldSelector = selector;
		selector = newSelector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.DEPLOYMENT_SPEC__SELECTOR, oldSelector, selector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentStrategy getStrategy() {
		if (strategy != null && strategy.eIsProxy()) {
			InternalEObject oldStrategy = (InternalEObject)strategy;
			strategy = (DeploymentStrategy)eResolveProxy(oldStrategy);
			if (strategy != oldStrategy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, K8sPackage.DEPLOYMENT_SPEC__STRATEGY, oldStrategy, strategy));
			}
		}
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentStrategy basicGetStrategy() {
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategy(DeploymentStrategy newStrategy) {
		DeploymentStrategy oldStrategy = strategy;
		strategy = newStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.DEPLOYMENT_SPEC__STRATEGY, oldStrategy, strategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PodTemplate getTemplate() {
		if (template != null && template.eIsProxy()) {
			InternalEObject oldTemplate = (InternalEObject)template;
			template = (PodTemplate)eResolveProxy(oldTemplate);
			if (template != oldTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, K8sPackage.DEPLOYMENT_SPEC__TEMPLATE, oldTemplate, template));
			}
		}
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PodTemplate basicGetTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(PodTemplate newTemplate) {
		PodTemplate oldTemplate = template;
		template = newTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.DEPLOYMENT_SPEC__TEMPLATE, oldTemplate, template));
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
				if (resolve) return getSelector();
				return basicGetSelector();
			case K8sPackage.DEPLOYMENT_SPEC__STRATEGY:
				if (resolve) return getStrategy();
				return basicGetStrategy();
			case K8sPackage.DEPLOYMENT_SPEC__TEMPLATE:
				if (resolve) return getTemplate();
				return basicGetTemplate();
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
