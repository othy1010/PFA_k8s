/**
 */
package k8s.impl;

import k8s.Affinity;
import k8s.Containers;
import k8s.K8sPackage;
import k8s.PodSpec;
import k8s.TopologySpreadConstraint;
import k8s.Volume;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pod Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link k8s.impl.PodSpecImpl#getContainers <em>Containers</em>}</li>
 *   <li>{@link k8s.impl.PodSpecImpl#getTopologySpreadConstraints <em>Topology Spread Constraints</em>}</li>
 *   <li>{@link k8s.impl.PodSpecImpl#getInitContainers <em>Init Containers</em>}</li>
 *   <li>{@link k8s.impl.PodSpecImpl#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link k8s.impl.PodSpecImpl#getRestartPolicy <em>Restart Policy</em>}</li>
 *   <li>{@link k8s.impl.PodSpecImpl#getAffinity <em>Affinity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PodSpecImpl extends SpecFactoryImpl implements PodSpec {
	/**
	 * The cached value of the '{@link #getContainers() <em>Containers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<Containers> containers;

	/**
	 * The cached value of the '{@link #getTopologySpreadConstraints() <em>Topology Spread Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologySpreadConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<TopologySpreadConstraint> topologySpreadConstraints;

	/**
	 * The cached value of the '{@link #getInitContainers() <em>Init Containers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<Containers> initContainers;

	/**
	 * The cached value of the '{@link #getVolumes() <em>Volumes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumes()
	 * @generated
	 * @ordered
	 */
	protected EList<Volume> volumes;

	/**
	 * The default value of the '{@link #getRestartPolicy() <em>Restart Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestartPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String RESTART_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRestartPolicy() <em>Restart Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestartPolicy()
	 * @generated
	 * @ordered
	 */
	protected String restartPolicy = RESTART_POLICY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAffinity() <em>Affinity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffinity()
	 * @generated
	 * @ordered
	 */
	protected Affinity affinity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PodSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return K8sPackage.Literals.POD_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Containers> getContainers() {
		return containers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainers(EList<Containers> newContainers) {
		EList<Containers> oldContainers = containers;
		containers = newContainers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.POD_SPEC__CONTAINERS, oldContainers, containers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TopologySpreadConstraint> getTopologySpreadConstraints() {
		return topologySpreadConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopologySpreadConstraints(EList<TopologySpreadConstraint> newTopologySpreadConstraints) {
		EList<TopologySpreadConstraint> oldTopologySpreadConstraints = topologySpreadConstraints;
		topologySpreadConstraints = newTopologySpreadConstraints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.POD_SPEC__TOPOLOGY_SPREAD_CONSTRAINTS, oldTopologySpreadConstraints, topologySpreadConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Containers> getInitContainers() {
		return initContainers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitContainers(EList<Containers> newInitContainers) {
		EList<Containers> oldInitContainers = initContainers;
		initContainers = newInitContainers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.POD_SPEC__INIT_CONTAINERS, oldInitContainers, initContainers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Volume> getVolumes() {
		return volumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumes(EList<Volume> newVolumes) {
		EList<Volume> oldVolumes = volumes;
		volumes = newVolumes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.POD_SPEC__VOLUMES, oldVolumes, volumes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRestartPolicy() {
		return restartPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestartPolicy(String newRestartPolicy) {
		String oldRestartPolicy = restartPolicy;
		restartPolicy = newRestartPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.POD_SPEC__RESTART_POLICY, oldRestartPolicy, restartPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Affinity getAffinity() {
		if (affinity != null && affinity.eIsProxy()) {
			InternalEObject oldAffinity = (InternalEObject)affinity;
			affinity = (Affinity)eResolveProxy(oldAffinity);
			if (affinity != oldAffinity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, K8sPackage.POD_SPEC__AFFINITY, oldAffinity, affinity));
			}
		}
		return affinity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Affinity basicGetAffinity() {
		return affinity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffinity(Affinity newAffinity) {
		Affinity oldAffinity = affinity;
		affinity = newAffinity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.POD_SPEC__AFFINITY, oldAffinity, affinity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case K8sPackage.POD_SPEC__CONTAINERS:
				return getContainers();
			case K8sPackage.POD_SPEC__TOPOLOGY_SPREAD_CONSTRAINTS:
				return getTopologySpreadConstraints();
			case K8sPackage.POD_SPEC__INIT_CONTAINERS:
				return getInitContainers();
			case K8sPackage.POD_SPEC__VOLUMES:
				return getVolumes();
			case K8sPackage.POD_SPEC__RESTART_POLICY:
				return getRestartPolicy();
			case K8sPackage.POD_SPEC__AFFINITY:
				if (resolve) return getAffinity();
				return basicGetAffinity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case K8sPackage.POD_SPEC__CONTAINERS:
				setContainers((EList<Containers>)newValue);
				return;
			case K8sPackage.POD_SPEC__TOPOLOGY_SPREAD_CONSTRAINTS:
				setTopologySpreadConstraints((EList<TopologySpreadConstraint>)newValue);
				return;
			case K8sPackage.POD_SPEC__INIT_CONTAINERS:
				setInitContainers((EList<Containers>)newValue);
				return;
			case K8sPackage.POD_SPEC__VOLUMES:
				setVolumes((EList<Volume>)newValue);
				return;
			case K8sPackage.POD_SPEC__RESTART_POLICY:
				setRestartPolicy((String)newValue);
				return;
			case K8sPackage.POD_SPEC__AFFINITY:
				setAffinity((Affinity)newValue);
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
			case K8sPackage.POD_SPEC__CONTAINERS:
				setContainers((EList<Containers>)null);
				return;
			case K8sPackage.POD_SPEC__TOPOLOGY_SPREAD_CONSTRAINTS:
				setTopologySpreadConstraints((EList<TopologySpreadConstraint>)null);
				return;
			case K8sPackage.POD_SPEC__INIT_CONTAINERS:
				setInitContainers((EList<Containers>)null);
				return;
			case K8sPackage.POD_SPEC__VOLUMES:
				setVolumes((EList<Volume>)null);
				return;
			case K8sPackage.POD_SPEC__RESTART_POLICY:
				setRestartPolicy(RESTART_POLICY_EDEFAULT);
				return;
			case K8sPackage.POD_SPEC__AFFINITY:
				setAffinity((Affinity)null);
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
			case K8sPackage.POD_SPEC__CONTAINERS:
				return containers != null;
			case K8sPackage.POD_SPEC__TOPOLOGY_SPREAD_CONSTRAINTS:
				return topologySpreadConstraints != null;
			case K8sPackage.POD_SPEC__INIT_CONTAINERS:
				return initContainers != null;
			case K8sPackage.POD_SPEC__VOLUMES:
				return volumes != null;
			case K8sPackage.POD_SPEC__RESTART_POLICY:
				return RESTART_POLICY_EDEFAULT == null ? restartPolicy != null : !RESTART_POLICY_EDEFAULT.equals(restartPolicy);
			case K8sPackage.POD_SPEC__AFFINITY:
				return affinity != null;
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
		result.append(" (containers: ");
		result.append(containers);
		result.append(", topologySpreadConstraints: ");
		result.append(topologySpreadConstraints);
		result.append(", initContainers: ");
		result.append(initContainers);
		result.append(", volumes: ");
		result.append(volumes);
		result.append(", restartPolicy: ");
		result.append(restartPolicy);
		result.append(')');
		return result.toString();
	}

} //PodSpecImpl
