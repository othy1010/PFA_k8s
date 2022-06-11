/**
 */
package k8s.impl;

import k8s.K8sPackage;
import k8s.LabelSelector;
import k8s.TopologySpreadConstraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topology Spread Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link k8s.impl.TopologySpreadConstraintImpl#getLabelSelector <em>Label Selector</em>}</li>
 *   <li>{@link k8s.impl.TopologySpreadConstraintImpl#getTopologyKey <em>Topology Key</em>}</li>
 *   <li>{@link k8s.impl.TopologySpreadConstraintImpl#getWhenUnsatisfiable <em>When Unsatisfiable</em>}</li>
 *   <li>{@link k8s.impl.TopologySpreadConstraintImpl#getMaxSkew <em>Max Skew</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopologySpreadConstraintImpl extends MinimalEObjectImpl.Container implements TopologySpreadConstraint {
	/**
	 * The cached value of the '{@link #getLabelSelector() <em>Label Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelSelector()
	 * @generated
	 * @ordered
	 */
	protected LabelSelector labelSelector;

	/**
	 * The default value of the '{@link #getTopologyKey() <em>Topology Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologyKey()
	 * @generated
	 * @ordered
	 */
	protected static final String TOPOLOGY_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopologyKey() <em>Topology Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologyKey()
	 * @generated
	 * @ordered
	 */
	protected String topologyKey = TOPOLOGY_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhenUnsatisfiable() <em>When Unsatisfiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenUnsatisfiable()
	 * @generated
	 * @ordered
	 */
	protected static final String WHEN_UNSATISFIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhenUnsatisfiable() <em>When Unsatisfiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenUnsatisfiable()
	 * @generated
	 * @ordered
	 */
	protected String whenUnsatisfiable = WHEN_UNSATISFIABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSkew() <em>Max Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSkew()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_SKEW_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxSkew() <em>Max Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSkew()
	 * @generated
	 * @ordered
	 */
	protected int maxSkew = MAX_SKEW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopologySpreadConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return K8sPackage.Literals.TOPOLOGY_SPREAD_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelSelector getLabelSelector() {
		return labelSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelSelector(LabelSelector newLabelSelector, NotificationChain msgs) {
		LabelSelector oldLabelSelector = labelSelector;
		labelSelector = newLabelSelector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, K8sPackage.TOPOLOGY_SPREAD_CONSTRAINT__LABEL_SELECTOR, oldLabelSelector, newLabelSelector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelSelector(LabelSelector newLabelSelector) {
		if (newLabelSelector != labelSelector) {
			NotificationChain msgs = null;
			if (labelSelector != null)
				msgs = ((InternalEObject)labelSelector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - K8sPackage.TOPOLOGY_SPREAD_CONSTRAINT__LABEL_SELECTOR, null, msgs);
			if (newLabelSelector != null)
				msgs = ((InternalEObject)newLabelSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - K8sPackage.TOPOLOGY_SPREAD_CONSTRAINT__LABEL_SELECTOR, null, msgs);
			msgs = basicSetLabelSelector(newLabelSelector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.TOPOLOGY_SPREAD_CONSTRAINT__LABEL_SELECTOR, newLabelSelector, newLabelSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTopologyKey() {
		return topologyKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopologyKey(String newTopologyKey) {
		String oldTopologyKey = topologyKey;
		topologyKey = newTopologyKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.TOPOLOGY_SPREAD_CONSTRAINT__TOPOLOGY_KEY, oldTopologyKey, topologyKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWhenUnsatisfiable() {
		return whenUnsatisfiable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenUnsatisfiable(String newWhenUnsatisfiable) {
		String oldWhenUnsatisfiable = whenUnsatisfiable;
		whenUnsatisfiable = newWhenUnsatisfiable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.TOPOLOGY_SPREAD_CONSTRAINT__WHEN_UNSATISFIABLE, oldWhenUnsatisfiable, whenUnsatisfiable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxSkew() {
		return maxSkew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSkew(int newMaxSkew) {
		int oldMaxSkew = maxSkew;
		maxSkew = newMaxSkew;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.TOPOLOGY_SPREAD_CONSTRAINT__MAX_SKEW, oldMaxSkew, maxSkew));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case K8sPackage.TOPOLOGY_SPREAD_CONSTRAINT__LABEL_SELECTOR:
				return basicSetLabelSelector(null, msgs);
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
			case K8sPackage.TOPOLOGY_SPREAD_CONSTRAINT__LABEL_SELECTOR:
				return getLabelSelector();
			case K8sPackage.TOPOLOGY_SPREAD_CONSTRAINT__TOPOLOGY_KEY:
				return getTopologyKey();
			case K8sPackage.TOPOLOGY_SPREAD_CONSTRAINT__WHEN_UNSATISFIABLE:
				return getWhenUnsatisfiable();
			case K8sPackage.TOPOLOGY_SPREAD_CONSTRAINT__MAX_SKEW:
				return getMaxSkew();
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
			case K8sPackage.TOPOLOGY_SPREAD_CONSTRAINT__LABEL_SELECTOR:
				setLabelSelector((LabelSelector)newValue);
				return;
			case K8sPackage.TOPOLOGY_SPREAD_CONSTRAINT__TOPOLOGY_KEY:
				setTopologyKey((String)newValue);
				return;
			case K8sPackage.TOPOLOGY_SPREAD_CONSTRAINT__WHEN_UNSATISFIABLE:
				setWhenUnsatisfiable((String)newValue);
				return;
			case K8sPackage.TOPOLOGY_SPREAD_CONSTRAINT__MAX_SKEW:
				setMaxSkew((Integer)newValue);
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
			case K8sPackage.TOPOLOGY_SPREAD_CONSTRAINT__LABEL_SELECTOR:
				setLabelSelector((LabelSelector)null);
				return;
			case K8sPackage.TOPOLOGY_SPREAD_CONSTRAINT__TOPOLOGY_KEY:
				setTopologyKey(TOPOLOGY_KEY_EDEFAULT);
				return;
			case K8sPackage.TOPOLOGY_SPREAD_CONSTRAINT__WHEN_UNSATISFIABLE:
				setWhenUnsatisfiable(WHEN_UNSATISFIABLE_EDEFAULT);
				return;
			case K8sPackage.TOPOLOGY_SPREAD_CONSTRAINT__MAX_SKEW:
				setMaxSkew(MAX_SKEW_EDEFAULT);
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
			case K8sPackage.TOPOLOGY_SPREAD_CONSTRAINT__LABEL_SELECTOR:
				return labelSelector != null;
			case K8sPackage.TOPOLOGY_SPREAD_CONSTRAINT__TOPOLOGY_KEY:
				return TOPOLOGY_KEY_EDEFAULT == null ? topologyKey != null : !TOPOLOGY_KEY_EDEFAULT.equals(topologyKey);
			case K8sPackage.TOPOLOGY_SPREAD_CONSTRAINT__WHEN_UNSATISFIABLE:
				return WHEN_UNSATISFIABLE_EDEFAULT == null ? whenUnsatisfiable != null : !WHEN_UNSATISFIABLE_EDEFAULT.equals(whenUnsatisfiable);
			case K8sPackage.TOPOLOGY_SPREAD_CONSTRAINT__MAX_SKEW:
				return maxSkew != MAX_SKEW_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (topologyKey: ");
		result.append(topologyKey);
		result.append(", whenUnsatisfiable: ");
		result.append(whenUnsatisfiable);
		result.append(", maxSkew: ");
		result.append(maxSkew);
		result.append(')');
		return result.toString();
	}

} //TopologySpreadConstraintImpl
